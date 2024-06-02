package splitwise.service;

import splitwise.model.Expense;
import splitwise.model.Group;
import splitwise.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class UserGroupService {

    Map<UUID, Group> groups = new HashMap<>();
    public Group createGroup(String name, List<User> participants) {
        Group group = new Group(name, participants);
        groups.put(group.getId(), group);
        return group;
    }

    public void addExpense(UUID groupId, Expense expenses){
        Group group = groups.get(groupId);
        List<Expense> groupExpenses = group.getExpenses();
        groupExpenses.add(expenses);

    }
}
