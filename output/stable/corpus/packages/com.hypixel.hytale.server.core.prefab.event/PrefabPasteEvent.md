# PrefabPasteEvent

Type: class | Package: com.hypixel.hytale.server.core.prefab.event | Extends: CancellableEcsEvent

public class PrefabPasteEvent extends CancellableEcsEvent

Cancellable ECS event that can be intercepted by event systems.

## Accessors

- getPrefabId() | int | Accessor method.
- isPasteStart() | boolean | Boolean accessor.

Also in this package: PrefabPlaceEntityEvent

Complete API:
  public int getPrefabId()
  public boolean isPasteStart()

Fields:
private final int prefabId
private final boolean pasteStart
