package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Bir tədbirdə iştirak edən insanların adlarını və onlara verilən identifikasiya nömrələrini HashMap istifadə edərək saxlayın.
//	1.	İştirakçıların identifikasiya nömrələri və adlarını əlavə edin.
//	2.	Verilən identifikasiya nömrəsinə əsasən iştirakçının adını tapın.
//	3.	Bir iştirakçını siyahıdan çıxarın.
//	4.	Bütün iştirakçıların siyahısını çap edin.
public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> participant = new HashMap<>();
        participant.put(1, "Ramil");
        participant.put(2, "Mehdi");
        participant.put(3, "Elvin");
        Set<Integer> idNumbers = participant.keySet();
        for (Integer id : idNumbers) {
            System.out.print("Id : " + id + " . ");
            System.out.println("Participant : " + participant.get(id));
        }
        System.out.println("----------------------------------");
        System.out.println(participant.remove(2, "Mehdi"));
        System.out.println("----------------------------------");
        for (Integer id : idNumbers) {
            System.out.print("Id : " + id + " . ");
            System.out.println("Participant : " + participant.get(id));
        }
    }
}
