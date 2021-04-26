
package gt.edu.miumg.sistemas.ingesoftware.parcial2.SelectionSort.Services;

public class SelectionSort implements ISelectionSort{

    @Override
    public String[] SortBySelection(String[] words) {
        int min;
        String temp = "";
        
        for(int i = 0; i<words.length; i++){
            
            min = i;
            
            for(int j = i + 1; j < words.length; j++){
                
                if(words[j].compareToIgnoreCase(words[i]) < 0){
                
                    temp = words[i];
                    words[i] = words[min];
                    words[min] = temp;
                     
                }
            
            }
            
        }

        return words;
        
    }
    
    
}
