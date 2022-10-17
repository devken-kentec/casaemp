package br.com.casadoempreendedor.service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.casadoempreendedor.domain.Empresas;
import br.com.casadoempreendedor.dto.EmpresasDTO;
import br.com.casadoempreendedor.repository.EmpresasRepository;


@Service
public class EmpresasService {
	
		@Autowired
		private EmpresasRepository er;
		
		public List<Empresas> findAll(){
			return er.findAll();
		}
		
		public Optional<Empresas> findById(Long id){
			return er.findById(id);
		}
		
		public void create(Empresas empresa) {
			er.save(empresa);
		}
		
		public void update(Empresas empresa) {
			Optional<Empresas> e = er.findById(empresa.getId());
			if(e.isPresent()) {
				er.save(empresa);	
			}
		}
		
		public Optional<EmpresasDTO> findByCnpj(String cnpj){
			return er.findByCnpj(cnpj).map(EmpresasDTO::new);
 		}
		
		public byte[] adicionarLogo(Part arquivo, Long id) {
			
			Optional<Empresas> emp = er.findById(id);
			
			return emp.map(c -> {
				try {
					InputStream is = arquivo.getInputStream();
					byte[] bytes = new byte[(int) arquivo.getSize()];
					IOUtils.readFully(is, bytes);
					c.setLogo(bytes);
					er.save(c);
					is.close();
					return bytes;
				} catch (Exception e) {
					return null;
				}
			}).orElse(null);
		}

}
