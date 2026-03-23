# ActionMount

Type: class | Package: com.hypixel.hytale.builtin.mounts.npc | Extends: ActionBase

public class ActionMount extends ActionBase

An NPC action that enables a player to mount an NPC entity. Built from a BuilderActionMount configuration. When executed, creates an NPCMountComponent on the NPC, changes the NPC to an empty role, and applies a custom `MovementConfig` to the mounting player.

## Constants

- EMPTY_ROLE_ID | "Empty_Role" | The NPC role ID assigned while the NPC is being ridden.

## Fields

- anchorX | float | X component of the player attachment offset.
- anchorY | float | Y component of the player attachment offset.
- anchorZ | float | Z component of the player attachment offset.
- movementConfigId | String | The `MovementConfig` asset ID applied to the rider.
- emptyRoleIndex | int | Index of the `"Empty_Role"` in the NPC plugin registry.

## Constructor


public ActionMount(@Nonnull BuilderActionMount builderActionMount, @Nonnull BuilderSupport builderSupport)

Reads anchor offsets and movement config from the builder, resolves the `"Empty_Role"` index.

## Methods

### canExecute


@Override
public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Returns `true` if the base conditions are met and the interaction target exists without a `DeathComponent`.

### execute


@Override
public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

1. If the NPC already has an `NPCMountComponent`, returns `false`.
2. Creates an `NPCMountComponent`, sets the original role index, owner player, and anchor.
3. Changes the NPC to `"Empty_Role"` via `RoleChangeSystem.requestRoleChange()`.
4. Loads the configured `MovementConfig` and applies it to the player's `MovementManager`.
5. Returns `true` on success.

## Related Types

- BuilderActionMount -- builder/config for this action
- NPCMountComponent -- the component created on the NPC
- NPCMountSystems.OnAdd -- processes the component after creation
