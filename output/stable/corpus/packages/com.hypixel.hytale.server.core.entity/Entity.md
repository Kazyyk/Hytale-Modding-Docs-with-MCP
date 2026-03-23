# Entity

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public abstract class Entity implements Component<EntityStore>

Abstract base class for all server-side entities. Implements `Component<EntityStore>` for the ECS architecture. Maintains a network ID, world reference, entity store reference, legacy UUID, legacy display name, and removal tracking. Provides static codec fields `MODEL`, `DISPLAY_NAME`, and `UUID`. The `CODEC` is an abstract builder codec (version 5) with legacy versioned support.
