package ExercicioFilaPilha;

class Fila
{
    private String[] arr;      
    private int primeiro;      
    private int ultimo;       
    private int capacidadefila;   
    private int tamanho;      
 
    Fila(int size)
    {
        arr = new String[size];
        capacidadefila = size;
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }
 
    public String removerItem()
    {
        if (filaVazia())
        {
            System.exit(-1);
        }
 
        String x = arr[primeiro];
 
 
        primeiro = (primeiro + 1) % capacidadefila;
        tamanho--;
        
        if(tamanho == 1){
            ultimo = primeiro;
        }
        return x;
    }
 
    public void adicionarItem(String item)
    {
        if (filaCheia())
        {
            System.exit(-1);
        }
 
        ultimo = (ultimo + 1) % capacidadefila;
        arr[ultimo] = item;
        tamanho++;
    }
 
    public String getPrimeiro()
    {
        if (filaVazia())
        {
            System.exit(-1);
        }
        return arr[primeiro];
    }

    public String getUltimo()
    {
        if (filaVazia())
        {
            System.exit(-1);
        }
        return arr[ultimo];
    }
 
    public int getTamanho() {
        return tamanho;
    }
 
    public boolean filaVazia() {
        return (getTamanho() == 0);
    }
 
    public boolean filaCheia() {
        return (getTamanho() == capacidadefila);
    }

    public static void ImprimirFila(Fila fila)
    {
        Fila filaaux = new Fila(100);
  
        while (!fila.filaVazia()) {
  
            filaaux.adicionarItem(fila.getPrimeiro());
            System.out.println(fila.removerItem()); 
        }
        while (!filaaux.filaVazia()) {
            fila.adicionarItem(filaaux.getPrimeiro());
            filaaux.removerItem();
        }
    }
}