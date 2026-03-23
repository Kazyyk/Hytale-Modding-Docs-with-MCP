# FragileBlock

Type: class | Package: com.hypixel.hytale.server.core.modules.blockhealth | Implements: Cloneable

public class FragileBlock implements Cloneable

Tracks the remaining fragility duration for a block, in seconds. Used by `BlockHealthModule` to mark recently placed blocks as temporarily fragile. The duration is decremented each tick until it reaches zero, at which point the entry is removed.

## Fields

- private float durationSeconds

## Methods

- public float getDurationSeconds()
- public void setDurationSeconds(float durationSeconds)
- public void deserialize(@Nonnull ByteBuf buf, byte version)
- public void serialize(@Nonnull ByteBuf buf)
- @Nonnull protected FragileBlock clone()
