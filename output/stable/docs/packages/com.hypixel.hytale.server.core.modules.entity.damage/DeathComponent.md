---
title: "DeathComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathComponent"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "death"
  - "component"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DeathComponent implements Component<EntityStore>
```

An ECS component added to an entity when it dies. Carries information about the cause of death, the death message, items lost, and respawn state. The presence of this component on an entity signals that it is dead, triggering death systems registered in [DamageModule](DamageModule.md). Serializable via `BuilderCodec` for persistence. Removal of this component (via `respawn()`) triggers the respawn system chain.

## Static Methods

```java
public static ComponentType<EntityStore, DeathComponent> getComponentType()
```

Returns the registered component type from [DamageModule](DamageModule.md).

```java
public static void tryAddComponent(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull Damage damage)
```

Adds a `DeathComponent` to the entity if it does not already have one, using a `CommandBuffer`.

```java
public static void tryAddComponent(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Damage damage)
```

Adds a `DeathComponent` to the entity if it does not already have one, using a `Store`.

```java
public static CompletableFuture<Void> respawn(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> ref)
```

Initiates the respawn process for the given entity. Delegates to the world's `RespawnController`. Returns a future that completes when respawn finishes, at which point the `DeathComponent` is removed.

## Constructors

```java
protected DeathComponent(@Nonnull Damage deathInfo)
```

Creates a death component from the killing damage event. Records the cause ID from the damage's `DamageCause`.

```java
protected DeathComponent()
```

Default constructor for codec deserialization.

## Methods

```java
@Nullable
public DamageCause getDeathCause()
```

Returns the `DamageCause` that killed the entity, resolved from the stored cause ID string.

```java
@Nullable
public Message getDeathMessage()
```

Returns the localized death message, or `null` if not yet set.

```java
public void setDeathMessage(@Nullable Message deathMessage)
```

Sets the death message displayed to players.

```java
public boolean isShowDeathMenu()
```

Returns `true` if the death screen should be shown to the player. Defaults to `true`.

```java
public void setShowDeathMenu(boolean showDeathMenu)
```

Sets whether to show the death screen.

```java
public ItemStack[] getItemsLostOnDeath()
```

Returns the array of items lost on death.

```java
public void setItemsLostOnDeath(List<ItemStack> itemsLostOnDeath)
```

Sets the items lost on death from a list.

```java
public double getItemsAmountLossPercentage()
```

Returns the percentage of item quantities lost on death.

```java
public void setItemsAmountLossPercentage(double itemsAmountLossPercentage)
```

Sets the item quantity loss percentage.

```java
public double getItemsDurabilityLossPercentage()
```

Returns the percentage of item durability lost on death.

```java
public void setItemsDurabilityLossPercentage(double itemsDurabilityLossPercentage)
```

Sets the item durability loss percentage.

```java
public boolean displayDataOnDeathScreen()
```

Returns `true` if death data (items lost, etc.) should be displayed on the death screen.

```java
public void setDisplayDataOnDeathScreen(boolean displayDataOnDeathScreen)
```

Sets whether to display death data on the death screen.

```java
@Nullable
public Damage getDeathInfo()
```

Returns the [Damage](Damage.md) event that killed the entity, or `null` after deserialization (transient).

```java
public DeathConfig.ItemsLossMode getItemsLossMode()
```

Returns the items loss mode (ALL, CONFIGURED, or NONE).

```java
public void setItemsLossMode(DeathConfig.ItemsLossMode itemsLossMode)
```

Sets the items loss mode.

```java
public DeathItemLoss getDeathItemLoss()
```

Returns a [DeathItemLoss](DeathItemLoss.md) snapshot of the current loss configuration.

```java
@Nullable
public InteractionChain getInteractionChain()
```

Returns the death interaction chain, or `null` if none was initiated.

```java
public void setInteractionChain(@Nullable InteractionChain interactionChain)
```

Sets the death interaction chain.

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Creates a shallow copy of this component.

## Related Types

- [Damage](Damage.md) -- the killing damage event
- [DamageCause](DamageCause.md) -- the type of damage that caused death
- [DeathItemLoss](DeathItemLoss.md) -- snapshot of item loss configuration
- [DeathSystems](DeathSystems.md) -- systems triggered by this component's addition
- [RespawnSystems](RespawnSystems.md) -- systems triggered by this component's removal
- [DamageModule](DamageModule.md) -- registers this component type
