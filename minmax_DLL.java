class DLL {
    class node {
        node next, prev;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
            this.prev = null;
        }

        node head, tail;

        void DLL() {
            head = null;
            tail = null;
        }

        public void insert(int val) {
            node newNode = new node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }
        }

    }
}