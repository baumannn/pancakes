#uses subshells for now to keep the pwd in root directory.
#todo: make a nice script later (build.xml?)

echo "building"
$(cd src/grammar; antlr4 Pancakes.g4 -package main.parser.generated -o ../main/parser/generated;)



#testing, check for errors etc. etc.
echo "testing"
mkdir -p misc/
$(cd src/grammar; antlr4 Pancakes.g4 -o ../../misc/);
$(cd misc; javac -cp /usr/local/Cellar/antlr/4.5.1/antlr-4.5.1-complete.jar $1*.java; grun Pancakes pancakes -diagnostics ../test.pcakes);
rm -rf misc;


dot file gen
echo "generating png files"
mkdir -p misc/dotFiles;
$(cd src/grammar; antlr4 Pancakes.g4 -atn -o ../../misc/dotFiles);
$(cd misc/dotFiles; find *.dot -exec dot {} -Tpng -o ../{}.png \;; cd ../; rm -rf dotFiles);

