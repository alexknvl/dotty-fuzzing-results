# Dotty Fuzzing results

Obtained by running https://github.com/alexknvl/fuzzball.

* `failed` - files that failed to compile at some point (not all will fail with the current `master` branch)
* `success` - files that successfully compiled at some point
* `minimized` - minimized bugs (will be updated as more are minimized)
* `log.txt` - a summary of all exceptions in `failed`

# Stats

Each line below corresponds to a unique stacktrace signature. These stats are **current**, and were recently tested on the `master` branch.

##### Glossary
 * `AE` - `AssertionError`
 * `CCE` - `ClassCastException`
 * `E` - `java.lang.Error`
 * `TUATE` - `dotty.tools.dotc.ast.Trees$UnAssignedTypeException`
 * `TTE` - `dotty.tools.dotc.core.Types$TypeError`
 * `IOOBE` - `IndexOutOfBoundsException`
 * `ME` - `MatchError`
 * `NPE` - `NullPointerException`
 * `SOE` - `StackOverflowError`
 * `NSEE` - `NoSuchElementException`
 * `UOE` - `UnsupportedOperationError`

97 different signatures in total:

| Signature     | Frequency in `failed`        |
| ------------- |-------------:|
| AE-cd393ad1a85496e16e4a95af4a557e75779c15ea | 2940 |
| AE-bce1c7762ed427e287e63ec7c139bec286987c93 | 674 |
| AE-270b484181ea429a28eaf801116ca12272259d92 | 302 |
| SOE-4f94ee4bd02174288f48202a4512da8e60761b06 | 165 |
| AE-13297bb04655927d4b1879c815c17944b05cb29d | 161 |
| AE-cbae138a436333e9ae09321078bdddc4519630c1 | 147 |
| AE-29cb09c2634ee7f19e86b5cb9bd508a168cd853d | 142 |
| AE-f28e95aa2b455852cbcfb84cb79c3f7bd24f1d3d | 103 |
| AE-896ca30202de8959c5c48ad67db6f20594b1b3d7 | 94 |
| ME-a2fe8ea36401dececbd0e276043703ff0ee3ef38 | 72 |
| SOE-e4f10db9ea4f061b151be30b8b50780c2b4642f4 | 54 |
| NPE-cddc4facb3a0f201fcc276e7767350cdb00ebcdd | 49 |
| CCE-799fa9bf8a836b566031926e6e5796062ac54bd1 | 46 |
| SOE-42b96e04cae9c81cbd1561a17795f8d2998bce66 | 43 |
| AE-c943923ca25764655386aea8a026a76a135ae47f | 38 |
| ME-2167f21efbc5ed4020f3eb79ad6d7d145013f213 | 36 |
| AE-01dfed8717d4f3e5f48d7e580aaec7e073a14f8d | 35 |
| AE-1cf0fd18fcd008c457956052df065fc51494b909 | 34 |
| E-068439c2b5754313b32b03319eb077410f5e0efb | 32 |
| SOE-b33ffcec6a101750802bcebecae59e6a657145aa | 31 |
| AE-4d0fd868f71b6e74abd0c5d7324d0fee11e068b7 | 31 |
| AE-739ecfcc7f770e87c713066ff07a41918b65a39e | 30 |
| CCE-d75a75285c16cf63a5239b8ba3e770fed397e9ed | 28 |
| SOE-0e8e0f9a33d973a777d1c108e16c64bc9ca0e47d | 25 |
| AE-06ba7eb049e1b41c0bb7e7828a70fd629af90e47 | 24 |
| SOE-af7d8508d3ecc8d4040b99369cacffde67b70778 | 23 |
| AE-cbb3f6deeeac5ab392132504b6b758583f9107a6 | 23 |
| CCE-e7437738a76ba5033e854a3f7ba167c9c590b28a | 21 |
| AE-bb96d4f22c584d1e1aa09a66447f8cc6f340625e | 21 |
| E-bc41bd3c7e59aba3c66436a754b8fef179a2f319 | 20 |
| AE-454ca691c2c4819798ccae629590176916179ddb | 20 |
| E-8e2848d4fec6ceefba2c07cad6793f039a1e497d | 19 |
| CCE-29242d99067aec443314ad543959885c9e7cd6d2 | 19 |
| NPE-d25d2d02b540a453f6e6542736a32dbf6d976b18 | 17 |
| CCE-ca4bdc644db547e927d2dc227b6dcc1269d96487 | 17 |
| AE-7d95df771272eebe5bddbae54d1dc521e0c24007 | 16 |
| AE-2323eb4f3b238ee959cf5201a26ec33925e66b59 | 16 |
| E-8fa6c6c982355d8e29b814cc059291453807f95e | 15 |
| NSEE-3fd544deb1cfa06a266ab056b61e8da6cfcb778d | 14 |
| AE-ef6949c8df3141fef7f01c448d1f2eb38265661c | 14 |
| SOE-4978db435b67799104dfe653e73bd484ee434185 | 13 |
| NPE-942f62a6f6713814416742b1d7f3427e47beb42c | 13 |
| SOE-9502112edecea94d0216a0dd4e57928637c0df1c | 10 |
| SOE-8fd16c4fcfe3292a5664353f943e25134abd7d93 | 10 |
| SOE-2356ce3bd16c9a516d456dc08c28366f9916aea3 | 10 |
| TUATE-bdbbae7577d209c9dbdc55450cc586e673871328 | 9 |
| SOE-533662bde1b732a20f8a5ebc5cc8f5ee73fa8f7a | 9 |
| SOE-c6254f9823885039dc14f3309385b278baa72fa8 | 8 |
| SOE-92084d849122c7163f385067e2396c9a49c82a3e | 8 |
| AE-625af1030531479c80a56ab71c7cb9a8af4cf9a6 | 8 |
| SOE-3b054f3f70501a7da4247d98487062c400fc80f7 | 7 |
| AE-e47c0a3617d3765e1b8ef07b65838eae625145cb | 7 |
| AE-7e00e48a0d7645b4ff2d037e610eb683f9314426 | 7 |
| SOE-d5a048755e8f58b0877c4d504f24cb70c7f78f88 | 6 |
| AE-33eece72f8e79e8ce68e44eeea3050fc7123f52e | 6 |
| SOE-a5a441228b272de333678c5025a1f570914ac5bd | 5 |
| AE-1b54c5e9f148973b215fba0747aa4219d4fb3b1f | 5 |
| SOE-8a19828c33a6037cf971793fc71e13770d794cb7 | 4 |
| SOE-1c83eb2422ce88bdafb98f25b3d34cab2c393914 | 4 |
| SOE-1a61b76c5db3d731eabeb2f0c238077463739112 | 4 |
| AE-67ac12eb08ce7fc05ce883539390dc26028c65bb | 4 |
| SOE-acca44604a13a4b0b68374f51619a9806e49093a | 3 |
| SOE-467ff5d2e7d1c88a1269f48f6f4abf590437cb3c | 3 |
| AE-dd14b91d8bc1cfa8f0eb4bfc58232950c2873c58 | 3 |
| AE-0ef7bc620ea17df89a1782806ecd9cc93c617768 | 3 |
| SOE-ee0ce3a1117b619985bc75dc1f71dc6c8c623fa4 | 2 |
| SOE-eada74ca81bfc1525b4259090fcb4dff79d0d0e6 | 2 |
| SOE-88aaae5ee699d4c79a22c1ebcde97ebe82d29efe | 2 |
| SOE-5333c3333ae082e24f44aeaf12bbaaa78d602de0 | 2 |
| SOE-3d7d24a2aed0a48372b3cd9c31e6a9fc113aecfd | 2 |
| SOE-17c413c42100403c227c47faf7387ba2f04ed906 | 2 |
| ME-657cf5bfd53344bfb60ec1a0d8d8c70cf89dced7 | 2 |
| AE-afdd8c5aae17186e4e95ce71aa300cdfb5481d0e | 2 |
| AE-1a071f2e5148fc36652eade68bcab69af1bb3fe5 | 2 |
| UOE-d2e2abe35d54014e5aefce96f60939adfcbf5c82 | 1 |
| TUATE-ef1619c91d2db9ae72eb6698721d310234e70f07 | 1 |
| TTE-ce2ef5ebf15c42f47f1105b3d63222b7ef39ed35 | 1 |
| SOE-f1ba0df939929b011a0f886b37bdc1bff9cc8c85 | 1 |
| SOE-ad5540243972b486679e863d43b9ae7d6acf7b2e | 1 |
| SOE-a782654b70d562eae624c04a42da733c1fbe5e0b | 1 |
| SOE-8f0dc3c29f0b48999101bb735d52dfa6f1e71880 | 1 |
| SOE-88b346a4d063619b2898407c4f776ead3068b74c | 1 |
| SOE-78fbb6ec2d9e639590db16bac0b28415030f51c7 | 1 |
| SOE-71f41e5c4679b2a2f31aaee36dee11c6759887a7 | 1 |
| SOE-695315909fb32fbbb8da2ee5f78ed542461910b7 | 1 |
| SOE-63986d3ad0c0fcbf3c7d9579bc23eb40bbdf9563 | 1 |
| SOE-5e9f46c9ca034011a55f9b5315b42fe6e7b669fd | 1 |
| SOE-5b4f32657906c4a8017379180bc21280998b93b3 | 1 |
| SOE-44fde55fcf33af814aa5986bcf7791c90e306b07 | 1 |
| SOE-2c7902ce958d64b26865724e78dabb8d6fd584f3 | 1 |
| SOE-0167645ed7bb80a03d4b801e2e4e964c7139901c | 1 |
| NSEE-7a8676dc28cf6051c2961e49d3892aeb518912e4 | 1 |
| NSEE-4bcd04f51bcadea70f02ea37f170411cd97c12c7 | 1 |
| NPE-921cb587018c622c72bb5912ec973c738781da55 | 1 |
| ME-666f53af454b04368cfed2ea72ebfb796c537d55 | 1 |
| IOOBE-1b4035e1d5b6023ecd1ef2673278057b5a3bb44c | 1 |
| AE-c00496e7589bb167f672670aac2ccf813dee6449 | 1 |
