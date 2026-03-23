# RotationTuple

Type: record | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config

Record combining `index`, `yaw`, `pitch`, and `roll` `Rotation` values into a single rotation state. Pre-computes all 64 possible combinations in a static `VALUES` array. Provides factory methods `of()`, index calculation, and rotation application to `Vector3d`.
