package mainPackage.libraryPackage;

public class Library {
    private String[][] books = new String[3][];
    private int size = 0;

    public void add(String[] book) {
        if (books.length == size) {
            String[][] tmp = new String[size * 2][];
            for (int i = 0; i < size; i++) {
                tmp[i] = books[i];
            }
            books = tmp;
        }
        books[size] = book;
        size++;
    }

    public void remove(int index) {
        if (index <= size) {
            for (int i = 0; i < size; i++) {
                if (i >= index) {
                    books[i] = books[i + 1];
                }
            }
            System.out.println("Book with index " + index + " has been removed");
            --size;
            print();
        } else {
            System.out.println("There is no index " + index + " in our assortment");
        }

    }

    public void print() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" * ");
        }
        System.out.println("Our book assortment:");
        for (int i = 0; i < size; i++) {
            System.out.print(" - ");
            System.out.println(books[i][0]);
        }
    }

    public void find(String looked) {
        if(looked.length()>=2){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < books[i].length; j++) {
                    if (books[i][j].toLowerCase().contains(looked.toLowerCase())) {
                        System.out.println("Book " + '"' + books[i][0] + '"' + " by " + books[i][1] + " has been found by search " + looked);
                    }
                }
            }
        } else{
            System.out.println("Type 2 letters at least");
        }

    }
}
