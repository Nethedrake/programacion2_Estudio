
package archivoBinarios;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class AñadirContenido extends ObjectOutputStream{
    
    public AñadirContenido(OutputStream out)throws IOException{
    super(out);
    }
    public AñadirContenido()throws IOException,SecurityException{
    
    }
    
    
    
    //para añadir una cabecera y mas texto
    @Override
    protected void writeStreamHeader() throws IOException{
    reset();
    }
}