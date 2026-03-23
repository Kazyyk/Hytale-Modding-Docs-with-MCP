# TeleportAllCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport | Extends: CommandBase

public class TeleportAllCommand extends CommandBase

## Fields

- private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- private final RequiredArg<Coord> xArg
- private final RequiredArg<Coord> yArg
- private final RequiredArg<Coord> zArg
- private final OptionalArg<RelativeFloat> yawArg
- private final OptionalArg<RelativeFloat> pitchArg
- private final OptionalArg<RelativeFloat> rollArg
- private final OptionalArg<World> worldArg
- Coord relX
- Coord relY
- Coord relZ
- World targetWorld
- Ref<EntityStore> senderRef
- Store<EntityStore> store
- double baseX
- double baseY
- double baseZ
- Ref<EntityStore> senderRefx
- Store<EntityStore> senderStore
- World senderWorld
- TransformComponent transformComponent
- Vector3d pos
- double x
- double z
- double y
- boolean hasRotation
- Ref<EntityStore> ref
- HeadRotation headRotationComponent
- Vector3d previousPos
- Vector3f previousHeadRotation
- Vector3f previousBodyRotation
- float yaw
- float pitch
- float roll
- Teleport teleport
- Player playerComponent
- PlayerRef playerRefComponent
- TeleportHistory teleportHistoryComponent
- float displayYaw
- float displayPitch
- float displayRoll

## Constructors

- public TeleportAllCommand()

## Methods

- protected void executeSync(@Nonnull CommandContext context)
- new Vector3d(x, y, z)
- new Vector3f(previousBodyRotation.getPitch()
- new Vector3f(pitch, yaw, roll)
