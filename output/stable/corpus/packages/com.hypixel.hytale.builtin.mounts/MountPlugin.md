# MountPlugin

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: JavaPlugin

public class MountPlugin extends JavaPlugin

The main plugin class for the mount system. Registers all mount-related ECS components, systems, commands, interactions, and packet handlers. Maintains a static singleton instance used by components to resolve their `ComponentType` references.

## Singleton Access


public static MountPlugin getInstance()

Returns the singleton `MountPlugin` instance. Set during `setup()`.

## Constructor


public MountPlugin(@Nonnull JavaPluginInit init)

Delegates to `JavaPlugin(init)`.

## Component Type Accessors

- getBlockMountComponentType() | ComponentType<ChunkStore, BlockMountComponent>
- getMountComponentType() | ComponentType<EntityStore, NPCMountComponent>
- getMountedComponentType() | ComponentType<EntityStore, MountedComponent>
- getMountedByComponentType() | ComponentType<EntityStore, MountedByComponent>
- getMinecartComponentType() | ComponentType<EntityStore, MinecartComponent>

## Setup

During `setup()`, the plugin performs the following registrations in order:

1. **ChunkStore component:** BlockMountComponent on the chunk store registry.
2. **NPC core component:** Registers `"Mount"` via `NPCPlugin.get().registerCoreComponentType()` with BuilderActionMount.
3. **EntityStore components:**
   - NPCMountComponent with codec key `"Mount"`.
   - MountedComponent (no default constructor -- throws `UnsupportedOperationException`).
   - MountedByComponent.
   - MinecartComponent with codec key `"Minecart"`.
4. **EntityStore systems:** All systems from MountSystems and NPCMountSystems.
5. **ChunkStore system:** MountSystems.RemoveBlockSeat.
6. **Packet handler:** MountGamePacketHandler via `ServerManager`.
7. **Command:** MountCommand (`/mount`).
8. **Interactions:** `"SpawnMinecart"`, `"Mount"`, and `"Seating"` registered on `Interaction.CODEC`.

## Static Utility Methods

### checkDismountNpc


public static void checkDismountNpc(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Player playerComponent)

Checks if the player has a non-zero mount entity ID and, if so, initiates NPC dismount by resetting the mount's role and the player's movement settings.

### resetOriginalPlayerMovementSettings


public static void resetOriginalPlayerMovementSettings(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> store)

Sends a `DismountNPC` packet to the player client and resets the player's `MovementManager` to default settings. Called when dismounting from an NPC mount.

## Related Types

- MountSystems -- entity mount ECS systems
- NPCMountSystems -- NPC-specific mount ECS systems
- MountCommand -- `/mount` command collection
- MountGamePacketHandler -- dismount packet handler
