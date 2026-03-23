# BuilderDescriptor

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderDescriptor

Describes a builder type's schema for documentation and validation generation. Contains the builder's name, category, lifecycle state, descriptions, and lists of BuilderAttributeDescriptor entries, validators, and provider evaluators.

## Fields

- name | String | The builder type name.
- category | String | The category string (e.g., "Role", "Action").
- state | BuilderDescriptorState | Lifecycle state.
- shortDescription | String | Brief description.
- longDescription | String | Detailed description.
- attributes | List<BuilderAttributeDescriptor> | Attribute definitions.
- validators | List<Validator> | Cross-attribute validators.
- providerEvaluators | List<ProviderEvaluator> | Feature provider evaluators.
- tags | Set<String> | Classification tags.

## Constructor


public BuilderDescriptor(String name, String category, String shortDescription, String longDescription, Set<String> tags, BuilderDescriptorState state)

## Methods

### addAttribute


public BuilderAttributeDescriptor addAttribute(BuilderAttributeDescriptor attributeDescriptor)

Adds a pre-built attribute descriptor and returns it for fluent chaining.


public BuilderAttributeDescriptor addAttribute(String name, String type, BuilderDescriptorState state, String shortDescription, String longDescription)

Creates and adds a new attribute descriptor.

### addValidator


public void addValidator(Validator validator)

Adds a cross-attribute validator.

### addProviderEvaluator


public void addProviderEvaluator(ProviderEvaluator providerEvaluator)

Adds a feature provider evaluator.

## Related Types

- BuilderAttributeDescriptor -- individual attribute metadata
- BuilderDescriptorState -- lifecycle state enum
- Builder -- `getDescriptor()` returns this type
