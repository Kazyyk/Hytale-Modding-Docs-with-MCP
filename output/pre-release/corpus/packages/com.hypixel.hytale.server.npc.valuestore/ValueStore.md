# ValueStore

Type: class | Package: com.hypixel.hytale.server.npc.valuestore | Implements: Component<EntityStore>

public class ValueStore implements Component<EntityStore>

An `EntityStore` component storing ValueStore-related data on entities.

## Fields

- @Nonnull private final String[] stringValues
- @Nonnull private final int[] intValues
- @Nonnull private final double[] doubleValues

## Methods

- private ValueStore(int stringCount, int intCount, int doubleCount)
- public static ComponentType<EntityStore, ValueStore> getComponentType()
- public String readString(int slot)
- public void storeString(int slot, String value)
- public int readInt(int slot)
- public void storeInt(int slot, int value)
- public double readDouble(int slot)
- public void storeDouble(int slot, double value)
- @Nonnull @Override public Component<EntityStore> clone()
