package ru.gb.oseminar.data;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
public int compare (Stream st1, Stream st2) {
int Groupquantity1 = st1.getGroups().size();
int Groupquantity2 = st2.getGroups().size();

return Integer.compare(Groupquantity1, Groupquantity2);
}    
}
