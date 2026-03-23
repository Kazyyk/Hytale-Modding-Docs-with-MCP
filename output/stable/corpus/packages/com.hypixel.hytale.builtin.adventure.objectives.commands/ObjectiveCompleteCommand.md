# ObjectiveCompleteCommand

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.commands | Extends: AbstractCommandCollection

public class ObjectiveCompleteCommand extends AbstractCommandCollection

Command to force-complete an active objective for specified players.

## Key Methods

- protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)

Also in this package: AddLocationMarkerCommand, AddReachLocationMarkerCommand, CompleteObjectiveCommand, CompleteTaskCommand, CompleteTaskSetCommand, DisableLocationMarkerCommand, EnableLocationMarkerCommand, ObjectiveCommand, ObjectiveHistoryCommand, ObjectiveLocationMarkerCommand, ObjectivePanelCommand, ObjectiveReachLocationMarkerCommand, ObjectiveStartCommand, StartObjectiveCommand, StartObjectiveLineCommand

Complete API:
  private static Objective getObjectiveFromId(Ref<EntityStore> participantRef, String objectiveId, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final Message MESSAGE_COMMANDS_OBJECTIVE_OBJECTIVE_NOT_FOUND
private static final Message MESSAGE_COMMANDS_OBJECTIVE_NO_TASK_FOR_INDEX
private static final Message MESSAGE_COMMANDS_OBJECTIVE_TASK_ALREADY_COMPLETED
