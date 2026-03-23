# EntityStore

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: WorldProvider

public class EntityStore implements WorldProvider

Central manager for entity-level ECS storage. Owns the `Store<EntityStore>`, UUID-to-reference and network-ID-to-reference lookups. Contains `UUIDSystem` and `NetworkIdSystem` inner classes for maintaining those indices.
