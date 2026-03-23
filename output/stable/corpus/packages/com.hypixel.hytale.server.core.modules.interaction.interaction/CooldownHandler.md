# CooldownHandler

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction | Implements: T, i, c, k, a, b, l, e

public final class CooldownHandler implements Tickable

Manages interaction cooldowns with charge-based timers. Tracks per-interaction cooldowns identified by string IDs, supporting configurable maximum time, charge arrays, and recharge interruption.

## Key Methods

- isOnCooldown(RootInteraction, String, float, float[], boolean) | boolean | Checks if the specified interaction is currently on cooldown
- resetCooldown(String, float, float[], boolean) | void | Resets the cooldown and charges for an interaction
- getCooldown(String, float, float[], boolean, boolean) | CooldownHandler.Cooldown | Gets or creates a cooldown entry; returns null if `force` is false and entry does not exist
- getCooldown(String) | CooldownHandler.Cooldown | Gets an existing cooldown entry by ID, or null
- tick(float) | void | Ticks all active cooldowns, removing expired entries

## Inner Classes

- `Cooldown` -- tracks remaining cooldown time, charge count, charge timer, and recharge interruption state. Fields: `cooldownMax`, `charges`, `remainingCooldown`, `chargeTimer`, `chargeCount`, `interruptRecharge`.

Also in this package: Cooldown, InteractionPacketGenerator, RootInteractionPacketGenerator, UnarmedInteractions, UnarmedInteractionsPacketGenerator

Complete API:
  public boolean isOnCooldown(RootInteraction root, String id, float maxTime, float[] chargeTimes, boolean interruptRecharge)
  public void resetCooldown(String id, float maxTime, float[] chargeTimes, boolean interruptRecharge)
  public CooldownHandler.Cooldown getCooldown(String id, float maxTime, float[] chargeTimes, boolean force, boolean interruptRecharge)
  public CooldownHandler.Cooldown getCooldown(String id)
  public void tick(float dt)

Fields:
private final Map<String,CooldownHandler.Cooldown> cooldowns
