# UUIDComponent

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public final class UUIDComponent implements Component<EntityStore>

An `EntityStore` component that stores a `UUID` for an entity. Provides `getUuid()`, static factory methods `generateVersion3UUID()` and `randomUUID()`, and a codec with non-null validation. The UUID is auto-generated during decode if null.
