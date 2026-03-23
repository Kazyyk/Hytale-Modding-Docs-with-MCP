# RoleDebugDisplay

Type: class | Package: com.hypixel.hytale.server.npc.role

public class RoleDebugDisplay

Renders debug information into an NPC's nameplate based on active RoleDebugFlags. Supports displaying: state name, time of day, flock membership, animation slots, locked target details (player username or NPC role name), light levels (sky/block RGB), pathfinder status, custom strings, free inventory slots, HP, stamina, speed, internal entity ID, role name, and marked target visualization arrows.

## Methods

- public void display(@Nonnull Role role, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- @Nullable public static RoleDebugDisplay create(@Nonnull EnumSet<RoleDebugFlags> debugFlags, @Nullable RoleDebugDisplay existingDisplay)

## Behavior

The `display` method builds a string from all enabled debug flags and sets it as the NPC's `Nameplate` text. The `create` factory returns `null` if no display-relevant flags are set, avoiding unnecessary nameplate updates. Reuses an existing instance when available to minimize allocation.

## Display Flags

Each boolean field corresponds to a RoleDebugFlags enum constant: `debugDisplayState`, `debugDisplayTime`, `debugDisplayFlock`, `debugDisplayAnim`, `debugDisplayLockedTarget`, `debugDisplayLightLevel`, `debugDisplayFreeSlots`, `debugDisplayCustom`, `debugDisplayPathFinder`, `debugDisplayHP`, `debugDisplayStamina`, `debugDisplaySpeed`, `debugDisplayInternalId`, `debugDisplayName`, `debugVisMarkedTargets`.

Also in this package: AvoidanceMode, DeferredAction, Role, RoleDebugFlags, RoleDebugPreset, RoleUtils, SeparationMode, SpawnEffect

Complete API:
  public void display(Role role, int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer)
  public static RoleDebugDisplay create(EnumSet<RoleDebugFlags> debugFlags, RoleDebugDisplay existingDisplay)

Fields:
protected boolean debugDisplayState
protected boolean debugDisplayTime
protected boolean debugDisplayFlock
protected boolean debugDisplayAnim
protected boolean debugDisplayLockedTarget
protected boolean debugDisplayLightLevel
protected boolean debugDisplayFreeSlots
protected boolean debugDisplayCustom
protected boolean debugDisplayPathFinder
protected boolean debugDisplayHP
protected boolean debugDisplayStamina
protected boolean debugDisplaySpeed
protected boolean debugDisplayInternalId
protected boolean debugDisplayName
protected boolean debugVisMarkedTargets
protected StringBuilder debugDisplay
