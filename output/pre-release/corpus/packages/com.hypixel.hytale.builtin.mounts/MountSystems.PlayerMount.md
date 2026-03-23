# MountSystems.PlayerMount

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: RefChangeSystem<EntityStore, MountedComponent>

public static class PlayerMount extends RefChangeSystem<EntityStore, MountedComponent>

Reacts to MountedComponent changes on player entities (those with `PlayerInput`) to synchronize the mount network ID on the player's input component.

## Behavior

- **onComponentAdded:** Resolves the mount target entity's `NetworkId` and sets it on `PlayerInput.setMountId()`. Clears the movement update queue.
- **onComponentRemoved:** Resets `PlayerInput.setMountId(0)`.
- **onComponentSet:** No-op.

## Query

Matches entities with `PlayerInput`.

## Related Types

- MountSystems -- enclosing class
- MountSystems.HandleMountInput -- processes input while mounted
