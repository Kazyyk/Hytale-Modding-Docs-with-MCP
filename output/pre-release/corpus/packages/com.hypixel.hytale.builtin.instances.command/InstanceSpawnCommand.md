# InstanceSpawnCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractPlayerCommand

public class InstanceSpawnCommand extends AbstractPlayerCommand

Extends `AbstractPlayerCommand`.

## Methods

- super("spawn", "server.commands.instances.spawn.desc")
- protected Vector3f getSpawnRotation(@Nonnull Ref<EntityStore> ref,
        @Nonnull CommandContext context,
        @Nonnull DefaultArg<Vector3f> rotationArg,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |

Also in this package: InstanceEditCopyCommand, InstanceEditListCommand, InstanceEditLoadCommand, InstanceEditNewCommand, InstanceExitCommand, InstanceExitOtherCommand, InstanceMigrateCommand, InstancesCommand, InstancesEditCommand

Complete API:
  protected Vector3f getSpawnRotation(Ref<EntityStore> ref, CommandContext context, DefaultArg<Vector3f> rotationArg, ComponentAccessor<EntityStore> componentAccessor)
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<String> instanceNameArg
private final OptionalArg<RelativeDoublePosition> positionArg
private final DefaultArg<Vector3f> rotationArg
