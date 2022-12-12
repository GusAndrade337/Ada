package ExercicioFilaPilha;

class Pilha
{
    private String arr[];
    private int topo;
    private int capacidadepilha;
 
    Pilha(int size)
    {
        arr = new String[size];
        capacidadepilha = size;
        topo = -1;
    }
 
    public void adicionarItem(String x)
    {
        if (pilhaCheia())
        {
            System.exit(-1);
        }
 
        arr[++topo] = x;
    }
 
    public String removerItem()
    {
        if (pilhaCheia())
        {
            System.exit(-1);
        }
 
 
        return arr[topo--];
    }
 
    public String getTopo()
    {
        if (!pilhaVazia()) {
            return arr[topo];
        }
        else {
            System.exit(-1);
        }
 
        return null;
    }
 
    public int getTamanho() {
        return topo + 1;
    }
 
    public boolean pilhaVazia() {
        return topo == -1;               
    }
 
    public boolean pilhaCheia() {
        return topo == capacidadepilha - 1;     
    }

    public static void ImprimirPilha(Pilha pilha)
    {
        Pilha pilhaaux = new Pilha(100);
  
        while (!pilha.pilhaVazia()) {
            pilhaaux.adicionarItem(pilha.getTopo());
  
            System.out.print(pilhaaux.getTopo()
                             + " ");
            pilha.removerItem();
        }

        while (!pilhaaux.pilhaVazia()) {
            pilha.adicionarItem(pilhaaux.getTopo());
            pilhaaux.removerItem();
        }
    }
}