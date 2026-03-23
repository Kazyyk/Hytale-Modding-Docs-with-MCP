# PrefabPlaceEntityEvent

Type: class | Package: com.hypixel.hytale.server.core.prefab.event | Extends: EcsEvent

public class PrefabPlaceEntityEvent extends EcsEvent

ECS event dispatched through the entity component system.

## Accessors

- getPrefabId() | int | Accessor method.
- getHolder() | Holder<EntityStore> | Accessor method.

Also in this package: PrefabPasteEvent

Complete API:
  public int getPrefabId()
  public Holder<EntityStore> getHolder()

Fields:
private final int prefabId
private final Holder<EntityStore> holder
