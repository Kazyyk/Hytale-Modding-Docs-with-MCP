# ReferenceProviderEvaluator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.providerevaluators | Implements: FeatureProviderEvaluator, ParameterProviderEvaluator

public class ReferenceProviderEvaluator implements FeatureProviderEvaluator, ParameterProviderEvaluator

## Fields

- private final int referenceIndex
- private final Class<?> classType
- private FeatureEvaluatorHelper resolvedProviderSet

## Methods

- @Override public boolean provides(EnumSet<Feature> feature)
- @Override public boolean hasParameter(String parameter, ParameterType type)
- @Override public void resolveReferences(BuilderManager manager)

Also in this package: FeatureProviderEvaluator, ParameterProviderEvaluator, ParameterType, ProviderEvaluator, ProviderEvaluatorTypeRegistry, UnconditionalFeatureProviderEvaluator, UnconditionalParameterProviderEvaluator

Complete API:
  public boolean provides(EnumSet<Feature> feature)
  public boolean hasParameter(String parameter, ParameterType type)
  public void resolveReferences(BuilderManager manager)

Fields:
private final int referenceIndex
private final Class<?> classType
private FeatureEvaluatorHelper resolvedProviderSet
