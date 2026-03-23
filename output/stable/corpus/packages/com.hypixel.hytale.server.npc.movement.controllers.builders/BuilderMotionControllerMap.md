# BuilderMotionControllerMap

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderBase<Map<String, MotionController>> | Implements: ISpawnable

public class BuilderMotionControllerMap extends BuilderBase<Map<String, MotionController>> implements ISpawnable

## Fields

- private final BuilderObjectMapHelper<String, MotionController> motionControllers
- BuilderInfo builderInfo

## Methods

- public Map<String, MotionController> build(@Nonnull BuilderSupport builderSupport)
- public String getShortDescription()
- public String getLongDescription()
- public BuilderDescriptorState getBuilderDescriptorState()
- public Builder<Map<String, MotionController>> readConfig(@Nonnull JsonElement data)
- null,
- new | BuilderValidationHelper(this.fileName, null, this.internalReferenceResolver, null, null, this.extraInfo, null, this.readErrors)
- public Class<Map<String, MotionController>> category()
- public final boolean isEnabled(ExecutionContext context)
- public String getIdentifier()
- public SpawnTestResult canSpawn(@Nonnull SpawningContext context)
- throw new IllegalStateException("MotionController must implement ISpawnable")
- public boolean validate(String configName,
        @Nonnull NPCLoadTimeValidationHelper validationHelper,
        @Nonnull ExecutionContext context,
        Scope globalScope,
        @Nonnull List<String> errors)` |
