/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tryfp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;

/**
 *
 * @author
 */
public class StreamOutput {
    private File output;
    private FileWriter writer;
    private BufferedWriter temp;
    private String file;
    private boolean existance;
    
    public StreamOutput(String text){
        this.file = text ;
    }

    public boolean isExist(){
        return existance;
    }
    public void writeFile() throws IOException{
        doWriting();
    }
    public void writeNewFile() throws
            IOException{
        try{
            output.createNewFile();
            doWriting();
            }catch(IOException ioe){
            throw new IOException(ioe);
        }
    }
        public StreamOutput setPath(String path){
            output = new File(path);
            searchFile();
            return this;
        }
        private void searchFile(){
            existance = output.exists();
        }
        private void doWriting() throws
                IOException{
            int start = 0, end = file.indexOf("\n");
            try{
                writer = new FileWriter(output);
                temp = new
                        BufferedWriter(writer);
                while(end!=-1){
                    temp.write(file.substring(start,end));
                    temp.newLine();
                    start = end + 1;
                    end = file.indexOf("\n",end+1);
                }
                
                temp.write(file.substring(start));
                temp.close();
                writer.close();
            }catch(IOException ioe){
                throw new IOException("Proses penulisan gagal, terjadi kesalahan di : \n"+ioe);
            }
        }
}