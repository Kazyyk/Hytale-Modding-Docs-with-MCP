# MovementEffects

Type: class | Package: com.hypixel.hytale.server.core.asset.modifiers | Implements: NetworkSerializable

public class MovementEffects implements NetworkSerializable

## Fields

- public static final BuilderCodec<MovementEffects> CODEC
- protected boolean disableAll
- protected boolean disableForward
- protected boolean disableBackward
- protected boolean disableLeft
- protected boolean disableRight
- protected boolean disableSprint
- protected boolean disableJump
- protected boolean disableCrouch

## Methods

- public boolean isDisableAll()
- @Nonnull public com.hypixel.hytale.protocol.MovementEffects toPacket()
- @Nonnull @Override public String toString()
