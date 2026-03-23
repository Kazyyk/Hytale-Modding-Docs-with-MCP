# DamageMemory

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.memory | Implements: Component<EntityStore>

public class DamageMemory implements Component<EntityStore>

## Fields

- private float recentDamage
- private float totalCombatDamage

## Methods

- public static ComponentType<EntityStore, DamageMemory> getComponentType()
- public float getRecentDamage()
- public float getTotalCombatDamage()
- public void addDamage(float damage)
- public void clearRecentDamage()
- public void clearTotalDamage()
- @Nonnull @Override public Component<EntityStore> clone()
- @Nonnull @Override public String toString()
