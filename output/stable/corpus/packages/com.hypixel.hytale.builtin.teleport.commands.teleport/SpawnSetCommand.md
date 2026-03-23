# SpawnSetCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport | Extends: AbstractWorldCommand

public class SpawnSetCommand extends AbstractWorldCommand

## Fields

- private static final DecimalFormat DECIMAL
- private static final Message MESSAGE_COMMANDS_ERROR_PROVIDE_POSITION
- private final OptionalArg<RelativeDoublePosition> positionArg
- private final DefaultArg<Vector3f> rotationArg
- Vector3d position
- RelativeDoublePosition relativePosition
- Ref<EntityStore> playerRef
- TransformComponent transformComponent
- Vector3f rotation
- Ref<EntityStore> playerRefx
- HeadRotation headRotationComponent
- Transform spawnTransform
- WorldConfig worldConfig

## Constructors

- public SpawnSetCommand()

## Methods

- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
- throw new GeneralCommandException(MESSAGE_COMMANDS_ERROR_PROVIDE_POSITION)
