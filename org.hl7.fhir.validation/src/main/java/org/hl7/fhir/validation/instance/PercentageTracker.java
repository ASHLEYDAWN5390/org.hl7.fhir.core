package org.hl7.fhir.validation.instance;

import org.hl7.fhir.r5.elementmodel.Element;

public class PercentageTracker {

  private int total;
  private int last; 
  private int current;
  
  private static int instance;
  
  public PercentageTracker(int total, String fhirType, String url) {
    this.total = total;
    instance++;
    last = 0;
    System.out.print("Validate "+fhirType+" against "+url);
  }

  public void done() {
    System.out.println("|");
  }

  public void seeElement(Element e) {
    if (e.getInstanceId() != instance) {
      e.setInstanceId(instance);
      current++;
      int pct = total == 0 ? 0: (current*100) / total;
      if (pct > last + 2) {
        while (last + 2 < pct) {
          System.out.print(".");
          last = last + 2;
          if (last % 20 == 0) {
            System.out.print(""+last);
          }
        }
      }
    }
  }

}