package splitwise.model;

import java.util.List;
import java.util.UUID;

public class Group {
   private UUID id;
   private String name;
   private List<User> participants;

   private List<Expense> expenses;
   public Group(String name, List<User> participants) {
      this.id= UUID.randomUUID();
      this.name=name;
      this.participants=participants;
   }

   public UUID getId() {
      return id;
   }

   public void setId(UUID id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<User> getParticipants() {
      return participants;
   }

   public void setParticipants(List<User> participants) {
      this.participants = participants;
   }

   public List<Expense> getExpenses() {
      return expenses;
   }

   public void setExpenses(List<Expense> expenses) {
      this.expenses = expenses;
   }
}
