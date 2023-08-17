/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

public enum StatusEnum {
    EM_PREPARACAO("Em preparacao"), 
    EM_TRANSPORTE("Em transporte"),
    ENTREGUE("Entregue ao Cliente");
    
    private String status;
    
    private StatusEnum(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;    
    }
}
