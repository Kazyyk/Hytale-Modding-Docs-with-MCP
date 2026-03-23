# InstanceDataResource

Type: class | Package: com.hypixel.hytale.builtin.instances.removal | Implements: Resource<ChunkStore>

public class InstanceDataResource implements Resource<ChunkStore>

Implementation of `Resource<ChunkStore>`.

## Fields

- isRemoving | boolean | boolean field.
- timeoutTimer | Instant | Instant field.
- idleTimeoutTimer | Instant | Instant field.
- hadPlayer | boolean | boolean field.
- worldTimeoutTimer | Instant | Instant field.

## Methods

- getResourceType() | ResourceType<ChunkStore, InstanceDataResource> | static public method.
- isRemoving() | boolean | public method.
- setRemoving(boolean removing) | void | public method.
- getTimeoutTimer() | Instant | public method.
- setTimeoutTimer(Instant timeoutTimer) | void | public method.
- getIdleTimeoutTimer() | Instant | public method.
- setIdleTimeoutTimer(Instant idleTimeoutTimer) | void | public method.
- hadPlayer() | boolean | public method.
- setHadPlayer(boolean hadPlayer) | void | public method.
- getWorldTimeoutTimer() | Instant | public method.
- setWorldTimeoutTimer(@Nullable Instant worldTimeoutTimer) | void | public method.
- clone() | InstanceDataResource | public method.
