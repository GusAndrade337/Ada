package ExercicioListaDuplamenteEncadeada;


public class ItemListaDuplamenteEncadeada<K> { 

        private K dado;
        private ItemListaDuplamenteEncadeada<K> anterior;
        private ItemListaDuplamenteEncadeada<K> proximo;

        public String convertToString() {
                return this.getDado().toString();
        }

        public K getDado() {
            return dado;
        }

        public void setDado(K dado) {
            this.dado = dado;
        }

        public ItemListaDuplamenteEncadeada<K> getAnterior() {
            return anterior;
        }
        public void setAnterior(ItemListaDuplamenteEncadeada<K> anterior) {
            this.anterior = anterior;
        }
        public ItemListaDuplamenteEncadeada<K> getProximo() {
            return proximo;
        }
        public void setProximo(ItemListaDuplamenteEncadeada<K> proximo) {
            this.proximo = proximo;
        }
}
