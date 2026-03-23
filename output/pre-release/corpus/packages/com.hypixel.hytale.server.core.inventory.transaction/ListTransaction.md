# ListTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: Transaction> | Implements: Transaction

public class ListTransaction<T extends Transaction> implements Transaction

## Constants

- public static final ListTransaction<?> EMPTY_SUCCESSFUL_TRANSACTION
- public static final ListTransaction<?> EMPTY_FAILED_TRANSACTION

## Fields

- private final boolean succeeded
- private final List<T> list

## Methods

- public static <T extends Transaction> ListTransaction<T> getEmptyTransaction(boolean succeeded)
- private ListTransaction(boolean succeeded)
- public ListTransaction(boolean succeeded, @Nonnull List<T> list)
- public boolean succeeded()
- public boolean wasSlotModified(short slot)
- public List<T> getList()
- public int size()
- public ListTransaction<T> toParent(ItemContainer parent, short start, ItemContainer container)
- public ListTransaction<T> fromParent(ItemContainer parent, short start, ItemContainer container)
- public String toString()
