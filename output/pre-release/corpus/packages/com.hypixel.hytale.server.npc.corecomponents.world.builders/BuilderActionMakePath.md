# BuilderActionMakePath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderActionBase

public class BuilderActionMakePath extends BuilderActionBase

Constructs a transient path for the NPC based on a series of rotations and distances. References a TransientPathDefinition object.

Also in this package: BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderActionMakePath readConfig(JsonElement data)
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public TransientPathDefinition getPath(BuilderSupport support)

Fields:
protected final BuilderObjectReferenceHelper<TransientPathDefinition> transientPath
