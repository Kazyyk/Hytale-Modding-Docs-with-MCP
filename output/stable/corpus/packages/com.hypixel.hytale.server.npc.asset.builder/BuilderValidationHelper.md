# BuilderValidationHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderValidationHelper

Bundles all contextual objects needed during builder configuration reading and validation into a single parameter object. Passed to `Builder.readConfig()` and used by BuilderBase to initialize its internal state.

## Constructor


public BuilderValidationHelper(String name, FeatureEvaluatorHelper featureEvaluator, InternalReferenceResolver internalReferenceResolver, StateMappingHelper stateMappingHelper, InstructionContextHelper instructionContextHelper, ExtraInfo extraInfo, List<Evaluator<?>> evaluators, List<String> readErrors)

## Accessors

- getName() | String | The builder/file name.
- getFeatureEvaluatorHelper() | FeatureEvaluatorHelper | Feature evaluation context.
- getInternalReferenceResolver() | InternalReferenceResolver | Local reference resolver.
- getStateMappingHelper() | StateMappingHelper | State machine helper.
- getInstructionContextHelper() | InstructionContextHelper | Instruction context.
- getExtraInfo() | ExtraInfo | Codec extra info.
- getReadErrors() | List<String> | Mutable error list.
- getEvaluators() | List<Evaluator<?>> | Decision maker evaluators.

## Related Types

- BuilderBase -- uses this during `preReadConfig`
- BuilderObjectReferenceHelper -- passes this to child builders

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public String getName()
  public FeatureEvaluatorHelper getFeatureEvaluatorHelper()
  public InternalReferenceResolver getInternalReferenceResolver()
  public StateMappingHelper getStateMappingHelper()
  public InstructionContextHelper getInstructionContextHelper()
  public ExtraInfo getExtraInfo()
  public List<String> getReadErrors()
  public List<Evaluator<?>> getEvaluators()

Fields:
private final String name
private final FeatureEvaluatorHelper featureEvaluatorHelper
private final InternalReferenceResolver internalReferenceResolver
private final StateMappingHelper stateMappingHelper
private final InstructionContextHelper instructionContextHelper
private final ExtraInfo extraInfo
private final List<Evaluator<?>> evaluators
private final List<String> readErrors
