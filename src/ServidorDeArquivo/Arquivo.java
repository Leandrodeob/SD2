package ServidorDeArquivo;

import java.io.Serializable;
import java.util.Date;
 
 
public class Arquivo implements Serializable {
 
         /**
          *
          */
         private static final long serialVersionUID = 1L;
         
         private String nome;
         private byte[] conteudo;
         private String diretorioDestino;
         private Date dataHoraUpload;        
         
         public Date getDataHoraUpload() {
                   return dataHoraUpload;
         }
         public void setDataHoraUpload(Date dataHoraUpload) {
                   this.dataHoraUpload = dataHoraUpload;
         }
         public String getNome() {
                   return nome;
         }
         public void setNome(String nome) {
                   this.nome = nome;
         }
         public byte[] getConteudo() {
                   return conteudo;
         }
         public void setConteudo(byte[] conteudo) {
                   this.conteudo = conteudo;
         }
         public String getDiretorioDestino() {
                   return diretorioDestino;
         }
         public void setDiretorioDestino(String diretorioDestino) {
                   this.diretorioDestino = diretorioDestino;
         }
		public void setTamanhoKB(long kbSize) {
			// TODO Auto-generated method stub
			
		}
		public void setPortaDestino(String text) {
			// TODO Auto-generated method stub
			
		}
		public int getTamanhoKB() {
			// TODO Auto-generated method stub
			return 0;
		}
}