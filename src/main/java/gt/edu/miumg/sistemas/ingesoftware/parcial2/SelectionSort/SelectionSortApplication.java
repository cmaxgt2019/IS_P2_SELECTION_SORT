package gt.edu.miumg.sistemas.ingesoftware.parcial2.SelectionSort;

import gt.edu.miumg.sistemas.ingesoftware.parcial2.SelectionSort.Services.ISelectionSort;
import gt.edu.miumg.sistemas.ingesoftware.parcial2.SelectionSort.Services.SelectionSort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelectionSortApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SelectionSortApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        ISelectionSort selSort =  new SelectionSort();
                String[] words ={"Lap","Router","Driver","Cisco","Connect","google"};
                String orderingArray[] = selSort.SortBySelection(words);
                for(int i = 0; i<words.length; i++){
        
            System.out.println(orderingArray[i]);
        }
        
       
        
    
    }

}
