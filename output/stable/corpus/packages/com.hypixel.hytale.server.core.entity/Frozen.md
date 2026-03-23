# Frozen

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public class Frozen implements Component<EntityStore>

Singleton marker `EntityStore` component indicating that an entity is frozen (immobilized). Uses a private constructor with a static `INSTANCE` and `get()` accessor. The `clone()` method returns the same singleton instance.
