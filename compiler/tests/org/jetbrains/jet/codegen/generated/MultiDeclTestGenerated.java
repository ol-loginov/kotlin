/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.jet.codegen.generated;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.generated.AbstractCodegenTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/multiDecl")
@InnerTestClasses({MultiDeclTestGenerated.ForArray.class, MultiDeclTestGenerated.ForIterator.class, MultiDeclTestGenerated.ForRange.class})
public class MultiDeclTestGenerated extends AbstractCodegenTest {
    public void testAllFilesPresentInMultiDecl() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl"), "kt", true);
    }
    
    @TestMetadata("ComplexInitializer.kt")
    public void testComplexInitializer() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ComplexInitializer.kt");
    }
    
    @TestMetadata("component.kt")
    public void testComponent() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/component.kt");
    }
    
    @TestMetadata("SimpleVals.kt")
    public void testSimpleVals() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/SimpleVals.kt");
    }
    
    @TestMetadata("SimpleValsExtensions.kt")
    public void testSimpleValsExtensions() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/SimpleValsExtensions.kt");
    }
    
    @TestMetadata("SimpleVarsExtensions.kt")
    public void testSimpleVarsExtensions() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/SimpleVarsExtensions.kt");
    }
    
    @TestMetadata("ValCapturedInFunctionLiteral.kt")
    public void testValCapturedInFunctionLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ValCapturedInFunctionLiteral.kt");
    }
    
    @TestMetadata("ValCapturedInLocalFunction.kt")
    public void testValCapturedInLocalFunction() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ValCapturedInLocalFunction.kt");
    }
    
    @TestMetadata("ValCapturedInObjectLiteral.kt")
    public void testValCapturedInObjectLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ValCapturedInObjectLiteral.kt");
    }
    
    @TestMetadata("VarCapturedInFunctionLiteral.kt")
    public void testVarCapturedInFunctionLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/VarCapturedInFunctionLiteral.kt");
    }
    
    @TestMetadata("VarCapturedInLocalFunction.kt")
    public void testVarCapturedInLocalFunction() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/VarCapturedInLocalFunction.kt");
    }
    
    @TestMetadata("VarCapturedInObjectLiteral.kt")
    public void testVarCapturedInObjectLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/VarCapturedInObjectLiteral.kt");
    }
    
    @TestMetadata("compiler/testData/codegen/multiDecl/forArray")
    @InnerTestClasses({ForArray.Int.class, ForArray.Long.class})
    public static class ForArray extends AbstractCodegenTest {
        public void testAllFilesPresentInForArray() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forArray"), "kt", true);
        }
        
        @TestMetadata("MultiDeclFor.kt")
        public void testMultiDeclFor() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/MultiDeclFor.kt");
        }
        
        @TestMetadata("MultiDeclForComponentExtensions.kt")
        public void testMultiDeclForComponentExtensions() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/MultiDeclForComponentExtensions.kt");
        }
        
        @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
        public void testMultiDeclForComponentMemberExtensions() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/MultiDeclForComponentMemberExtensions.kt");
        }
        
        @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
        public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
        }
        
        @TestMetadata("MultiDeclForValCaptured.kt")
        public void testMultiDeclForValCaptured() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/MultiDeclForValCaptured.kt");
        }
        
        @TestMetadata("compiler/testData/codegen/multiDecl/forArray/int")
        public static class Int extends AbstractCodegenTest {
            public void testAllFilesPresentInInt() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forArray/int"), "kt", true);
            }
            
            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/int/MultiDeclForComponentExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
            public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/int/MultiDeclForComponentExtensionsValCaptured.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/int/MultiDeclForComponentMemberExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/int/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/codegen/multiDecl/forArray/long")
        public static class Long extends AbstractCodegenTest {
            public void testAllFilesPresentInLong() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forArray/long"), "kt", true);
            }
            
            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/long/MultiDeclForComponentExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
            public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/long/MultiDeclForComponentExtensionsValCaptured.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/long/MultiDeclForComponentMemberExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forArray/long/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("ForArray");
            suite.addTestSuite(ForArray.class);
            suite.addTestSuite(Int.class);
            suite.addTestSuite(Long.class);
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/codegen/multiDecl/forIterator")
    @InnerTestClasses({ForIterator.LongIterator.class})
    public static class ForIterator extends AbstractCodegenTest {
        public void testAllFilesPresentInForIterator() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forIterator"), "kt", true);
        }
        
        @TestMetadata("MultiDeclFor.kt")
        public void testMultiDeclFor() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/MultiDeclFor.kt");
        }
        
        @TestMetadata("MultiDeclForComponentExtensions.kt")
        public void testMultiDeclForComponentExtensions() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/MultiDeclForComponentExtensions.kt");
        }
        
        @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
        public void testMultiDeclForComponentMemberExtensions() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/MultiDeclForComponentMemberExtensions.kt");
        }
        
        @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
        public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
        }
        
        @TestMetadata("MultiDeclForValCaptured.kt")
        public void testMultiDeclForValCaptured() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/MultiDeclForValCaptured.kt");
        }
        
        @TestMetadata("compiler/testData/codegen/multiDecl/forIterator/longIterator")
        public static class LongIterator extends AbstractCodegenTest {
            public void testAllFilesPresentInLongIterator() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forIterator/longIterator"), "kt", true);
            }
            
            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/longIterator/MultiDeclForComponentExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
            public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/longIterator/MultiDeclForComponentExtensionsValCaptured.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/longIterator/MultiDeclForComponentMemberExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forIterator/longIterator/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("ForIterator");
            suite.addTestSuite(ForIterator.class);
            suite.addTestSuite(LongIterator.class);
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/codegen/multiDecl/forRange")
    @InnerTestClasses({ForRange.ExplicitRangeTo.class, ForRange.ExplicitRangeToWithDot.class, ForRange.Int.class, ForRange.Long.class})
    public static class ForRange extends AbstractCodegenTest {
        public void testAllFilesPresentInForRange() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange"), "kt", true);
        }
        
        @TestMetadata("MultiDeclFor.kt")
        public void testMultiDeclFor() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/MultiDeclFor.kt");
        }
        
        @TestMetadata("MultiDeclForComponentExtensions.kt")
        public void testMultiDeclForComponentExtensions() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/MultiDeclForComponentExtensions.kt");
        }
        
        @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
        public void testMultiDeclForComponentMemberExtensions() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/MultiDeclForComponentMemberExtensions.kt");
        }
        
        @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
        public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
        }
        
        @TestMetadata("MultiDeclForValCaptured.kt")
        public void testMultiDeclForValCaptured() throws Exception {
            blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/MultiDeclForValCaptured.kt");
        }
        
        @TestMetadata("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo")
        @InnerTestClasses({ExplicitRangeTo.Int.class, ExplicitRangeTo.Long.class})
        public static class ExplicitRangeTo extends AbstractCodegenTest {
            public void testAllFilesPresentInExplicitRangeTo() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo"), "kt", true);
            }
            
            @TestMetadata("MultiDeclFor.kt")
            public void testMultiDeclFor() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/MultiDeclFor.kt");
            }
            
            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/MultiDeclForComponentExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/MultiDeclForComponentMemberExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
            
            @TestMetadata("MultiDeclForValCaptured.kt")
            public void testMultiDeclForValCaptured() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/MultiDeclForValCaptured.kt");
            }
            
            @TestMetadata("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/int")
            public static class Int extends AbstractCodegenTest {
                public void testAllFilesPresentInInt() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/int"), "kt", true);
                }
                
                @TestMetadata("MultiDeclForComponentExtensions.kt")
                public void testMultiDeclForComponentExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/int/MultiDeclForComponentExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
                public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/int/MultiDeclForComponentExtensionsValCaptured.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
                public void testMultiDeclForComponentMemberExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/int/MultiDeclForComponentMemberExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
                public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/int/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
                }
                
            }
            
            @TestMetadata("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/long")
            public static class Long extends AbstractCodegenTest {
                public void testAllFilesPresentInLong() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/long"), "kt", true);
                }
                
                @TestMetadata("MultiDeclForComponentExtensions.kt")
                public void testMultiDeclForComponentExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/long/MultiDeclForComponentExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
                public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/long/MultiDeclForComponentExtensionsValCaptured.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
                public void testMultiDeclForComponentMemberExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/long/MultiDeclForComponentMemberExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
                public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeTo/long/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
                }
                
            }
            
            public static Test innerSuite() {
                TestSuite suite = new TestSuite("ExplicitRangeTo");
                suite.addTestSuite(ExplicitRangeTo.class);
                suite.addTestSuite(Int.class);
                suite.addTestSuite(Long.class);
                return suite;
            }
        }
        
        @TestMetadata("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot")
        @InnerTestClasses({ExplicitRangeToWithDot.Int.class, ExplicitRangeToWithDot.Long.class})
        public static class ExplicitRangeToWithDot extends AbstractCodegenTest {
            public void testAllFilesPresentInExplicitRangeToWithDot() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot"), "kt", true);
            }
            
            @TestMetadata("MultiDeclFor.kt")
            public void testMultiDeclFor() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/MultiDeclFor.kt");
            }
            
            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/MultiDeclForComponentExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/MultiDeclForComponentMemberExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
            
            @TestMetadata("MultiDeclForValCaptured.kt")
            public void testMultiDeclForValCaptured() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/MultiDeclForValCaptured.kt");
            }
            
            @TestMetadata("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/int")
            public static class Int extends AbstractCodegenTest {
                public void testAllFilesPresentInInt() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/int"), "kt", true);
                }
                
                @TestMetadata("MultiDeclForComponentExtensions.kt")
                public void testMultiDeclForComponentExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/int/MultiDeclForComponentExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
                public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/int/MultiDeclForComponentExtensionsValCaptured.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
                public void testMultiDeclForComponentMemberExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/int/MultiDeclForComponentMemberExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
                public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/int/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
                }
                
            }
            
            @TestMetadata("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/long")
            public static class Long extends AbstractCodegenTest {
                public void testAllFilesPresentInLong() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/long"), "kt", true);
                }
                
                @TestMetadata("MultiDeclForComponentExtensions.kt")
                public void testMultiDeclForComponentExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/long/MultiDeclForComponentExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
                public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/long/MultiDeclForComponentExtensionsValCaptured.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
                public void testMultiDeclForComponentMemberExtensions() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/long/MultiDeclForComponentMemberExtensions.kt");
                }
                
                @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
                public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                    blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/explicitRangeToWithDot/long/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
                }
                
            }
            
            public static Test innerSuite() {
                TestSuite suite = new TestSuite("ExplicitRangeToWithDot");
                suite.addTestSuite(ExplicitRangeToWithDot.class);
                suite.addTestSuite(Int.class);
                suite.addTestSuite(Long.class);
                return suite;
            }
        }
        
        @TestMetadata("compiler/testData/codegen/multiDecl/forRange/int")
        public static class Int extends AbstractCodegenTest {
            public void testAllFilesPresentInInt() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/int"), "kt", true);
            }
            
            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/int/MultiDeclForComponentExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
            public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/int/MultiDeclForComponentExtensionsValCaptured.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/int/MultiDeclForComponentMemberExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/int/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/codegen/multiDecl/forRange/long")
        public static class Long extends AbstractCodegenTest {
            public void testAllFilesPresentInLong() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/multiDecl/forRange/long"), "kt", true);
            }
            
            @TestMetadata("MultiDeclForComponentExtensions.kt")
            public void testMultiDeclForComponentExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/long/MultiDeclForComponentExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentExtensionsValCaptured.kt")
            public void testMultiDeclForComponentExtensionsValCaptured() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/long/MultiDeclForComponentExtensionsValCaptured.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensions.kt")
            public void testMultiDeclForComponentMemberExtensions() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/long/MultiDeclForComponentMemberExtensions.kt");
            }
            
            @TestMetadata("MultiDeclForComponentMemberExtensionsInExtensionFunction.kt")
            public void testMultiDeclForComponentMemberExtensionsInExtensionFunction() throws Exception {
                blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/forRange/long/MultiDeclForComponentMemberExtensionsInExtensionFunction.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("ForRange");
            suite.addTestSuite(ForRange.class);
            suite.addTest(ExplicitRangeTo.innerSuite());
            suite.addTest(ExplicitRangeToWithDot.innerSuite());
            suite.addTestSuite(Int.class);
            suite.addTestSuite(Long.class);
            return suite;
        }
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("MultiDeclTestGenerated");
        suite.addTestSuite(MultiDeclTestGenerated.class);
        suite.addTest(ForArray.innerSuite());
        suite.addTest(ForIterator.innerSuite());
        suite.addTest(ForRange.innerSuite());
        return suite;
    }
}