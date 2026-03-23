# PrefabCopyableComponent

Type: class | Package: com.hypixel.hytale.server.core.prefab | Implements: Component<EntityStore>

public class PrefabCopyableComponent implements Component<EntityStore>

Singleton marker component indicating that an entity can be copied as part of a prefab operation. Uses a single shared `INSTANCE` -- cloning returns the same instance. Registered on `EntityModule`.

## Fields

- public static final PrefabCopyableComponent INSTANCE
- public static final BuilderCodec<PrefabCopyableComponent> CODEC

## Methods

- public static ComponentType<EntityStore, PrefabCopyableComponent> getComponentType()
- public static PrefabCopyableComponent get()
- public Component<EntityStore> clone()
