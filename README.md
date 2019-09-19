# eclipse-bug-536592

In this example there are two projects that containing a:
runtime dependency from `some.consumer` to `some.provider`

and a
compile time dependency from `some.provider` to `some.consumer` 

due to the the contributions of the `org.eclipse.pde.ManifestBuilder` to the build time dependency digraph
this results in a cycle and can break the eclipse build without showing the cycle itself in eclipse.

The runtime dependencies in the `org.eclipse.pde.ManifestBuilder` are used since this change:
https://bugs.eclipse.org/bugs/show_bug.cgi?id=532264
commit b456c5512e3ef0bb42491251772beee8bd31c397

org.eclipse.pde.internal.core.DynamicPluginProjectReferences
