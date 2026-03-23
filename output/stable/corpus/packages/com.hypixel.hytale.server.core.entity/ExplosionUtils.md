# ExplosionUtils

Type: class | Package: com.hypixel.hytale.server.core.entity

public class ExplosionUtils

Static utility for performing explosions in the world. The `performExplosion()` method applies block damage in a sphere (using `BlockSphereUtil`), applies entity damage with distance falloff via `DamageSystems`, and applies knockback to affected entities. Handles block gathering/drops based on config and tool type.
