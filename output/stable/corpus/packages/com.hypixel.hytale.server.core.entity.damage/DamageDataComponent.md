# DamageDataComponent

Type: class | Package: com.hypixel.hytale.server.core.entity.damage | Implements: Component

public class DamageDataComponent implements Component

## Fields

- private Instant lastCombatAction
- private Instant lastDamageTime
- private WieldingInteraction currentWielding
- private Instant lastChargeTime

## Methods

- @Nonnull public static ComponentType<EntityStore,DamageDataComponent> getComponentType()
- @Nonnull public Instant getLastCombatAction()
- public void setLastCombatAction(Instant lastCombatAction)
- @Nonnull public Instant getLastDamageTime()
- public void setLastDamageTime(Instant lastDamageTime)
- @Nullable public Instant getLastChargeTime()
- public void setLastChargeTime(Instant lastChargeTime)
- @Nullable public WieldingInteraction getCurrentWielding()
- public void setCurrentWielding(WieldingInteraction currentWielding)
- @Nonnull @Override public Component<EntityStore> clone()

Also in this package: DamageDataSetupSystem

Complete API:
  public static ComponentType<EntityStore,DamageDataComponent> getComponentType()
  public Instant getLastCombatAction()
  public void setLastCombatAction(Instant lastCombatAction)
  public Instant getLastDamageTime()
  public void setLastDamageTime(Instant lastDamageTime)
  public Instant getLastChargeTime()
  public void setLastChargeTime(Instant lastChargeTime)
  public WieldingInteraction getCurrentWielding()
  public void setCurrentWielding(WieldingInteraction currentWielding)
  public Component<EntityStore> clone()

Fields:
private Instant lastCombatAction
private Instant lastDamageTime
private WieldingInteraction currentWielding
private Instant lastChargeTime
