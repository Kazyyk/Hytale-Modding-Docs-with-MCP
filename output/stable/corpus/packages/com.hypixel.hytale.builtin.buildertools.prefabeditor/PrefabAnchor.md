# PrefabAnchor

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Implements: Component

public class PrefabAnchor implements Component<EntityStore>

Marker component attached to anchor entities within a prefab edit session. Uses a singleton pattern (`INSTANCE`). The component type is registered by `BuilderToolsPlugin`.

## Fields

- INSTANCE | PrefabAnchor | Singleton instance.
- CODEC | BuilderCodec<PrefabAnchor> | Codec that always deserializes to the singleton.

## Methods

- getComponentType() | ComponentType<EntityStore, PrefabAnchor> | Returns the component type from `BuilderToolsPlugin`.
- clone() | Component<EntityStore> | Returns the singleton instance.
