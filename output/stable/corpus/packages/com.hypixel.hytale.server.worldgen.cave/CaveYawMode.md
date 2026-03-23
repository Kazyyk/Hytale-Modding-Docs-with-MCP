# CaveYawMode

Type: enum | Package: com.hypixel.hytale.server.worldgen.cave

public enum CaveYawMode

Enumeration controlling how a child node's yaw combines with the parent node's yaw and prefab rotation.

## Enum Constants

- `NODE` -- Uses the parent node's yaw directly.
- `SUM` -- Adds the parent prefab rotation's yaw to the parent node's yaw.
- `PREFAB` -- Uses only the parent prefab rotation's yaw, ignoring the parent node's yaw.

## Key Methods

- public abstract float combine(float parentYaw, @Nullable PrefabRotation parentRotation)
